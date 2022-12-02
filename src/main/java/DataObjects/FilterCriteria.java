package DataObjects;

public class FilterCriteria {
    private String andOr;
    private String field;
    private String operator;
    private String value;

    public FilterCriteria(String andOr, String field, String operator, String value) {
        this.andOr = andOr;
        this.field = field;
        this.operator = operator;
        this.value = value;
    }

    public String getAndOr() {
        return andOr;
    }

    public void setAndOr(String andOr) {
        this.andOr = andOr;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
