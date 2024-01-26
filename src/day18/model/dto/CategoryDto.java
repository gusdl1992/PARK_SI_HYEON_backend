package day18.model.dto;

// 카테고리
public class CategoryDto {

    // 필드
    private int gno;            // 카테고리 번호
    private String bcategory;   // 카테고리 명

    // 생성자
    public CategoryDto() {}
    // 풀생성자
    public CategoryDto(int gno, String bcategory) {
        this.gno = gno;
        this.bcategory = bcategory;
    }

    // get set

    public int getGno() {
        return gno;
    }

    public void setGno(int gno) {
        this.gno = gno;
    }

    public String getBcategory() {
        return bcategory;
    }

    public void setBcategory(String bcategory) {
        this.bcategory = bcategory;
    }
}
