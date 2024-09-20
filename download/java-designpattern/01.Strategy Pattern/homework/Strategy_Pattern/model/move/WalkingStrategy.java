package Strategy_Pattern.model.move;

import Strategy_Pattern.model.common.ifMovingStrategy;

public class WalkingStrategy implements ifMovingStrategy{
    public void move(){
        System.out.println("빠른 걷기");
    }
}
