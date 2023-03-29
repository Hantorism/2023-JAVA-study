package practice01;
// TO DO : extract Unit class from 3 class.
public class Practice01 {
    public static void main(String args[]) {
        Unit unit = new Unit();
        unit.move(1,1);
        unit.stop();
        System.out.println("Test seems Correct");
    }
}

class Marine {
    int x, y;
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    void stop() { /* 현재 위치에 정지 */ }

    void stimPack() { /* 스팀팩을 사용한다. */ }
}

class Tank {
    int x, y;
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    void stop() { /* 현재 위치에 정지 */ }

    void changeMode() { /* 공격모드를 변환한다. */ }
}

class Dropship {
    int x, y;
    void move(int x, int y) { /* 지정된 위치로 이동 */ }
    void stop() { /* 현재 위치에 정지 */ }

    void load() { /* 선택된 대상을 태운다. */ }
    void unload() { /* 선택된 대상을 내린다. */ }
}