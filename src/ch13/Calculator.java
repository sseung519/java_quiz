package ch13;

public class Calculator {
    public int memory;

    public int getMemory(){
        return memory;
    }

    public void setMemory1(int memory) throws InterruptedException {
        this.memory = memory;
        Thread.sleep(2000);
        //현재 실행되고 있는 스레드의 이름과 mermoy 필드 값 출력
        System.out.println(Thread.currentThread().getName() + ": "  + this.memory);
    }
    public void setMemory2(int memory) throws InterruptedException {
        this.memory = memory;
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ": "  + this.memory);

    }
}
