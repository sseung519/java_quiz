package ch14;

public class Quiz03{
    public static void main(String[] args) {
        Thread video = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<3;i++) {
                    System.out.println("동영상을 재생합니다.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        video.start();

        Thread music = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<3;i++) {
                    System.out.println("음악을 재생합니다.");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        });
        music.start();
    }
   }
