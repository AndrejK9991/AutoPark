public enum CategoryOfRights {
    A(),

    B(),

    C();

    private String str;

    CategoryOfRights(String str) {

        this.str = str;
    }

    public String getStr(){

        return str;
    }


}
