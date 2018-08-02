package main

import (
	"fmt"
	"go/ast"
	"go/parser"
	"go/token"
	"os"
)

func dump(fset *token.FileSet, n ast.Node, name string, t string) {
	var pos = fset.Position(n.Pos())
	fmt.Printf("%s,%s,%d,%d\n", name, t, pos.Line, pos.Column)
}

func main() {
	fset := token.NewFileSet()

	if len(os.Args) < 2 {
		os.Exit(1)
	}

	f, err := parser.ParseFile(fset, os.Args[1], nil, 0)
	if err != nil {
		fmt.Println(err)
		os.Exit(1)
	}
	ast.Inspect(f, func(n ast.Node) bool {
		switch x := n.(type) {
		case *ast.AssignStmt:
			for _, expr := range x.Lhs {
				switch id := expr.(type) {
				case *ast.Ident:
					dump(fset, id, id.Name, "variable")
				}
			}
		case *ast.FuncDecl:
			dump(fset, n, x.Name.Name, "function")
		case *ast.ValueSpec:
			for _, node := range x.Names {
				dump(fset, node, node.Name, "variable")
			}
		}
		return true
	})
}
