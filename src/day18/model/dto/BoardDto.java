package day18.model.dto;

public class BoardDto {
    private int bno;                // 글번호
    private String btitle;          // 제목
    private String bcontent;        // 내용
    private String btime;           // 시간
    private int bviews;             // 조회수
    private int mno;								 //member primary key
    private int gno;								 //category primary key

    // 기본생성자
    public BoardDto() {};
    // 풀생성자
    public BoardDto(int bno, String btitle, String bcontent, String btime, int bviews, int mno, int gno) {
        this.bno = bno;
        this.btitle = btitle;
        this.bcontent = bcontent;
        this.btime = btime;
        this.bviews = bviews;
        this.mno = mno;
        this.gno = gno;
    }
    // 글쓰기생성자
    public BoardDto(String btitle, String bcontent) {
        this.btitle = btitle;
        this.bcontent = bcontent;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    public String getBtime() {
        return btime;
    }

    public void setBtime(String btime) {
        this.btime = btime;
    }

    public int getBviews() {
        return bviews;
    }

    public void setBviews(int bviews) {
        this.bviews = bviews;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }

    public int getGno() {
        return gno;
    }

    public void setGno(int gno) {
        this.gno = gno;
    }
}


