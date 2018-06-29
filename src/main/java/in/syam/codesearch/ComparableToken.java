package in.syam.codesearch;

import org.antlr.v4.runtime.Token;
import com.google.common.base.Objects;
public final class ComparableToken {
        public final Token t;
        public ComparableToken(Token token) {
            t = token;
        }

        @Override
        public boolean equals(Object o) {
            if(o == this)
                return true;
            if (!(o instanceof ComparableToken))
                return false;
            ComparableToken ct = (ComparableToken) o;
            return Objects.equal(ct.t.getText(), t.getText()) && 
                   Objects.equal(ct.t.getLine(), t.getLine()) && 
                   Objects.equal(ct.t.getCharPositionInLine(), t.getCharPositionInLine());
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(t.getText(), t.getLine(), t.getCharPositionInLine());
        }
    }