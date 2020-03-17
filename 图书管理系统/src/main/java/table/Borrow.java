package table;

public class Borrow {
    private int no;
    private int bno;
    private String borrowTime;//借阅时间
    private String returnTime;//归还时间

    public Borrow(int no, int bno,  String borrowTime, String returnTime) {
        this.no = no;
        this.bno = bno;
        this.borrowTime = borrowTime;
        this.returnTime = returnTime;
    }


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }


    public String getBorrowTime() {
        return borrowTime;
    }

    public void setBorrowTime(String borrowTime) {
        this.borrowTime = borrowTime;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }
}

