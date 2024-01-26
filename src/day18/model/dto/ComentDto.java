package day18.model.dto;


// 뎃글 Dto
public class ComentDto {
    // 필드
    private int cno;                    //덧글번호식별
    private String ccontent;             //뎃글 내용
    private int bno;                     //게시판 글 primary key
    private int mno;                    // member primary key

    // 생성자

    public ComentDto() {}
    // 풀생성자
    public ComentDto(int cno, String ccontent, int bno, int mno) {
        this.cno = cno;
        this.ccontent = ccontent;
        this.bno = bno;
        this.mno = mno;
    }

    // 뎃글 작성 생성자
    public ComentDto(String ccontent) {
        this.ccontent = ccontent;
    }

    // get set


    public int getCno() {
        return cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public int getBno() {
        return bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public int getMno() {
        return mno;
    }

    public void setMno(int mno) {
        this.mno = mno;
    }
}
