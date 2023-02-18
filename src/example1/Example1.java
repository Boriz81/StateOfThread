package example1;

public class Example1 {
    public static void main(String[] args) throws InterruptedException{
        Thread thread = new Example1Thread();
        System.out.println(thread.getState());

        thread.start();
        System.out.println(thread.getState());
        Thread thread2 = new Example1Thread2(thread);
        thread2.start();

        Example1Thread2.threadRunner(thread);
        System.out.println(thread2.getState());
        //Example1Thread2.threadRunner(thread);
        //System.out.println(thread2.getState());

       // thread.join();

        System.out.println(thread.getState());

    }
}

// https://docs.google.com/forms/d/e/1FAIpQLSe-f-D3xBDX9VopzTDDkqMYG6vCzDjs4kzp1a2ByHuaTa6eXw/viewscore?pli=1&pli=1&viewscore=AE0zAgDmAi85o-oFSsEJe3sTZamHPDmpnc8Q8ROMMIcGRmK5yob31QMgm0pMazKtvnAJZNU
