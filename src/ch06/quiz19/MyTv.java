package ch06.quiz19;

public class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
        // (1) isPowerOn의 값이 true면 false로, false면 true로 바꾼다.
        if (isPowerOn) {
            isPowerOn = false;
        } else {
            isPowerOn = true;
        }
    }

    void volumeUp() {
        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1증가시킨다.
        if (volume < MAX_VOLUME) {
            volume++;
        }
    }

    void volumeDown() {
        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1감소시킨다.
        if (volume > MIN_VOLUME) {
            volume--;
        }

    }

    void channelUp() {
        // (4)만일 channel이 MAX_CHANNEL이면, channel의 값을 MIN_CHANNEL로 바꾼다.
        //그렇지 않으면 1을 증가시킨다.
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            channel++;
        }
    }

    void channelDown() {
        // (5) 만일 channel이 MIN_CHANNEL이면, channel의 값을
        // MAX_CHANNEL로 바꾼다.
        // 그렇지 않으면 1을 감소시킨다.
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }

    }

}
