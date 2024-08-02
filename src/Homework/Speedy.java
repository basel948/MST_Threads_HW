package Homework;

public class Speedy implements Runnable
{
    private boolean flag;
    private Speedy speedy;


    public Speedy(Speedy speedy) {
        this.speedy = speedy;
        this.flag = true;
    }

    @Override
    public void run() {

            for (int i=0; i<100; i++)
            {
                if(!flag)
                    break;

                System.out.println("Speedy: " + i);
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        System.out.println("Speedy is done");
        speedy.stop();
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    private void stop(){
        this.flag = false;
    }

}
