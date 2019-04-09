package rocks.zipcode.io.quiz4.objectorientation;

import rocks.zipcode.io.quiz4.fundamentals.StringEvaluator;

/**
 * @author leon on 11/12/2018.
 */
public class StringAssembler {
    StringBuilder result;
    Character delimeter;
    public StringAssembler(Character delimeter) {
        this.delimeter = delimeter;
        result = new StringBuilder();
    }

    public StringAssembler append(String str) {
        result.append(str);
        result.append(delimeter);
        return this;

    }

    public String assemble() {
        result.deleteCharAt(result.length()-1);
        return result.toString();
    }
}
