package ch14.Quiz04;

public class Video extends Thread{
    @Override
    public void run() {
        for(int i=0;i<3;i++) {
            System.out.println("동영상을 재생합니다.");
            try {
                Video.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
