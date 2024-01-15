class Datee{
    int dd,mm,yy;

    public Datee(){}

    public Datee(int dd, int mm, int yy){
        this.dd = dd;
        this.mm = mm;
        this.yy = yy;
    }
    @Override
    public String toString(){
        return dd + "/" + mm + "/" + yy;
    }
}