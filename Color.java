public enum Color {
    YELLOW(),

    BLUE(),

    BLACK();

    private String str;

    Color(String str) {
        this.str = str;
    }

    public String getStr(){
        return str;
    }



}
