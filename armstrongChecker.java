import javax.swing.JOptionPane;

public class armstrongChecker {
    public static void main (String[] args){
        int kont = 0;
        
        while(kont != 1)
        {
            int num ,yuz ,on ,bir ;
            String sayi = JOptionPane.showInputDialog(null,"3 Basamakli Sayi giriniz: ","Armstrong Sayi mi?",3);
            num = Integer.valueOf(sayi);
            yuz = num / 100;
            on = num % 100;
            on = on / 10;
            bir = num - ((yuz*100) + (on*10));
                if (num / 1000 >= 1 || num / 100 <= 1)
                {
                    JOptionPane.showMessageDialog(null,"Girdiginiz sayi 3 basamakli degil !","Armstrong Sayi mi?",JOptionPane.ERROR_MESSAGE);
                }
                else if ((yuz*yuz*yuz)+(on*on*on)+(bir*bir*bir) == num)
                {
                    JOptionPane.showMessageDialog(null,"Girdiginiz sayi bir armstrong sayidir: "+num,"Armstrong Sayi mi?",JOptionPane.PLAIN_MESSAGE);
                    kont = 1;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"Girdiginiz sayi bir armstrong sayi degildir! Tekrar deneyiniz ","Armstrong Sayi mi?",JOptionPane.ERROR_MESSAGE);
                }
        }
    }
}