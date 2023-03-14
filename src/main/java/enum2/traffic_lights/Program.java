package enum2.traffic_lights;

import java.util.Timer;
import java.util.TimerTask;


public class Program extends Methods {
    States state = States.GREEN;
    static Timer timer = new Timer();
    boolean dir = true;

    private static class ChangeState extends TimerTask {
        private final Program lights;
        public ChangeState(Program lights) {

            this.lights = lights;
        }


        /**
         * Override method from TimerTask that switches traffic lights.
         * If the light is red o green, it turns into yellow, if it's yellow, and before it, it was green, it turns
         * into red...
         */
        @Override
        public void run() {
            switch (lights.state){
                case RED:
                    lights.dir = false;
                    lights.state = States.YELLOW;
                    break;
                case YELLOW:
                    if(lights.dir){
                        lights.state = States.RED;
                    }
                    else{
                        lights.state = States.GREEN;
                    }
                    break;
                case GREEN:
                    lights.dir = true;
                    lights.state = States.YELLOW;
                    break;
            }
            System.out.println(lights.state);
            timer.schedule(new ChangeState(lights),1000);    // state.time);
        }
    }

    /**
     * Method Schedules and prints the changed states of Traffic Lights.
     */
    public void changeState(){
        System.out.println("state");
        timer.schedule(new Program.ChangeState(this), state.sec);
    }
}
