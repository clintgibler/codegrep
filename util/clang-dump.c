#include<stdio.h>
#include <clang-c/Index.h>

void dump(char *type, CXCursor c) {
    CXSourceLocation location = clang_getCursorLocation(c);
    unsigned int line = 0;
    unsigned int col = 0;
    clang_getSpellingLocation(location, NULL, &line, &col, NULL);

	printf("%s,%s,%d,%d\n",
        clang_getCString(clang_getCursorSpelling(c)),
        type,
        line,
        col
    );
}

enum CXChildVisitResult visitor(CXCursor c, CXCursor parent, CXClientData client_data) {
    if (clang_Location_isFromMainFile (clang_getCursorLocation (c)) == 0) {
        return CXChildVisit_Continue;
    }
    enum CXCursorKind kind  = clang_getCursorKind(c);
    switch(kind) {
        case CXCursor_CXXMethod:
            dump("method", c);
            break;
	    case CXCursor_ClassDecl:
            dump("class", c);
            break;
        case CXCursor_FunctionDecl:
            dump("function", c);
            break;
        case CXCursor_Namespace:
            dump("namespace", c);
            break;
        case CXCursor_StructDecl:
            dump("struct", c);
            break;
        case CXCursor_UnionDecl:
            dump("union", c);
            break;
        case CXCursor_VarDecl:
            dump("variable", c);
            break;
    }
  return CXChildVisit_Recurse;
}

int main(int argc, char **argv) {
 if(argc < 1) {
    return 1;
 }
 CXIndex idx = clang_createIndex(0, 0);
 CXTranslationUnit unit = clang_parseTranslationUnit(
    idx,
    argv[1], NULL, 0,
    NULL, 0,
    CXTranslationUnit_None);
  CXCursor cursor = clang_getTranslationUnitCursor(unit);
  clang_visitChildren(cursor, visitor, NULL);
  clang_disposeIndex(idx);
  return 0;
}
