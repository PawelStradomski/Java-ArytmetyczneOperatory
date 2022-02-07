
package Arytmetyczne.Operatory;


public class ArytmetyczneOperatory {

    /*
    Liczby typy calkowite:
    byte - 8 bit od -128 do 127
    short - 16 bit od -32,768 do 32,767
    int - 32 bit od -2^31 do 2 ^31
    long - 64 bit od -2^63 do 2^63
    
    Znakowe:
    char - 2 bajtowy tzn 2*8bitow=16 bitow
    String - ciag znakow
    
    Liczby typy zmiennoprzecinskowe:
    float - 32 bity - raczej sie juz nie korzysta
    double - 64 bity - prawie zawsze stosuj double. Pamieci RAM juz sa duze
    
    Nie wolno:
    1) uzywac w nazwie zmiennej keyword, np zarezerwowanych jak public, class
    2) nie wolno rozpoczac nazwy zmiennej od liczby, np 45Gosia. Mozna napisac G45Gosia
    3) nie wolno korzystac w nazwie zmiennej ze spacji np double = 45 45, mozna double liczba_Pi 
    
    
     */
    public static void main(String[] args) {
    
        System.out.println("Pawel ucz sie"); 
        
        String imię = "Pawel";
        String nazwisko = "Stradomski";
        System.out.println("imię + nazwisko");
        System.out.println(imię + nazwisko);
        System.out.println("imię: " + imię + " " + "nazwisko: " + nazwisko);
        System.out.println("imię:" + " "  + imię);
        System.out.println("nazwisko:" + " " + nazwisko);
        
        String daneOsobowe = imię + nazwisko;
        System.out.println(daneOsobowe);
        
        float liczba2 = 4.57f;
        double liczba3 = 4.12345;
        double g = liczba2 + liczba3;
        
        System.out.println(liczba2 + liczba3);
        System.out.println(g);
        
        int a = 5;
        int b = 6;
        int c;
        c = a + b;
        System.out.println(c);
        
        long d = 12345678912123456L;
        int e = 222;
        long f;
        f = d + e;
        System.out.println(f);
        
        /* Rzutowanie 
        np a++ to jest to samo co: a += 1; - powieksza o 1
                                   a += 2; - powieksza o 2 itp 
        */
        
        int h = 6, i = 5;
        double j = 10, k = 5; 
        System.out.println(h / (double)i);
        System.out.println(j / k);
        System.out.println(j+k);
        
        int wynik1 = h / (int)i;
        double wynik2 = j / k;
        System.out.println(wynik1);
        System.out.println(wynik2);
        System.out.println(1 / 5);
        System.out.println((double) 1 /5);
        System.out.println(1.0 / 5);
        
        int m = 1;
        double n = 1.5;
        m++;
        n++;
        
        System.out.println(m);
        System.out.println(n);
        
        int o = 100;
        double p = 100.5;
        
        o += 2;
        p *= 2;
        System.out.println(o);
        System.out.println(p);
        
        double r = 2.2;
        System.out.println(r++);
        System.out.println(r);
        System.out.println(++r);
        
        double s = 5.2;
        s /= 2;
        System.out.println(s);
        System.out.println(++s);
        
        /* Operatory Relacyjne (Porównania)
        ==  - porownanie
        !=  - różne
        >   - wieksze od
        <   - mniejsze od
        >=  - wieksze badz rowne
        <=  - mniejsze badz rowne
        
        */
        
        boolean isTrue = 4 == 4;
       
        System.out.println(isTrue);
        System.out.println(5>4);
        System.out.println(5<4);
        System.out.println(5!=9);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
        
        
        
       
            
       
            
           
               
           
            
            
            
           
                       
               
               
               
               
           
           
           
      
        
       
        
            
            
        
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
        
        
        
        
        
        
        
                
            
            
        
        
        
        
        
                  
        
        
        
    }
    

