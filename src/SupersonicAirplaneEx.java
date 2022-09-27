public class SupersonicAirplaneEx {
    public void execute() {
        SupersonicAirplane sa = new SupersonicAirplane();

        sa.takdOff();
        sa.fly();
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        sa.fly();
        sa.land();
    }
}
