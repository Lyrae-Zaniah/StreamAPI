package Streams.Reduce;

public class MediaTeste {

    public static void main(String[] args) {

        Media m1 = new Media()
        .adicionar(8.3)
        .adicionar(5.7)
        .adicionar(7.7)
        .adicionar(9.7)
        .adicionar(10);

        Media m2 = new Media()
        .adicionar(5.3)
        .adicionar(4.7)
        .adicionar(3.7)
        .adicionar(2.7)
        .adicionar(1.1);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1,m2).getValor());
    }
}
