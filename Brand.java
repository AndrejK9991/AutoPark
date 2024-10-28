public enum Brand {

    AUDI("AUDI"),

    MERSEDES("MERSEDES"),

    BMW("BMW");

    private String str;

    Brand(String str) {

        this.str = str;
    }

    public String getStr(){

        return str;
    }

}
