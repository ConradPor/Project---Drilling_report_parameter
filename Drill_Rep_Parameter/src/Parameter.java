class Parameter {
    String depth;  //5 składowych służące do przechowywania czterech atrybutów
    String headerTwo;
    String headerThree;
    String headerFour;
    String headerFive;


    public Parameter(String dpt, String hT, String hTr, String hFr, String hFv) {
        depth = dpt;   //Wartości wszystkich składowyc (ew. bez this)
        headerTwo = hT;
        headerThree = hTr;
        headerFour = hFr;
        headerFive = hFv;
    }

    public String getDepth() {   // Metody pobierające wartości poszczególnych atrybutów
        return depth; }

    public void setDepth(String depth) {
        this.depth = depth; }

    public String getHeaderTwo() {
        return headerTwo; }

    public void setHeaderTwo(String headerTwo) {
        this.headerTwo = headerTwo; }

    public String getHeaderThree() {
        return headerThree; }

    public void setHeaderThree(String headerThree) {
        this.headerThree = headerThree; }

    public String getHeaderFour() {
        return headerFour; }

    public void setHeaderFour(String headerFour) {
        this.headerFour = headerFour; }

    public String getHeaderFive() {
        return headerFive; }

    public void setHeaderFive(String headerFive) {
        this.headerFive = headerFive; }



    @Override public String toString() {
        return depth + " "+headerTwo + " " + headerThree + " " + headerFour + " " + headerFive;
    }




}