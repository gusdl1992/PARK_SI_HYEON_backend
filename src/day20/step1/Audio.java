package day20.step1;


// 구현 클래스 -> new 구현객체
public class Audio implements RemoteControl{
    
    // 클래스 멤버
    // 1. 필드 ( 인스턴스 멤버 vs 정적 멤버 )
    private int volume;
    // 2. 생성자 ( 오버로딩 )
    // 3. 메소드 ( 인스턴스 메소드 vs 정적 메소드 ) ( 오버로딩 vs 오버라이딩 )
    
    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio를 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > RemoteControl.MAX_VOLUME){
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 " + this.volume);
    } // me

    // 필드
    private int memoryVolume; // 무음 처리시 볼륨 임시 저장.
    // default 메소드 오버라이딩
    @Override
    public void setMute(boolean mute) {
        if(mute){
            this.memoryVolume = this.volume;
            System.out.println("무음 처리 합니다.");
            setVolume(RemoteControl.MIN_VOLUME);
        }else {
            System.out.println("무음 해제 합니다.");
            setVolume(this.memoryVolume);
        }
    } // m e


}
