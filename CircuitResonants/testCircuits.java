public class testCircuits 
{
    public static void main (String[] args)
    {
        ResonantCircuit RC = new ResonantCircuit(3.2,2.4,5.6);
        ParallelResonantCircuit PRC = new ParallelResonantCircuit(3.2,2.4,5.6);
        SeriesResonantCircuit SRC = new SeriesResonantCircuit(3.2,2.4,5.6);
        System.out.println(RC.getB());
        RC.setB(4.7);
        System.out.println(RC.getK());
        RC.setK(1.4);
        System.out.println(RC.getW0());
        RC.setW0(9.2);
        RC.display();
        PRC.design();
        PRC.display();
        SRC.design();
        SRC.display();
    } 
}
