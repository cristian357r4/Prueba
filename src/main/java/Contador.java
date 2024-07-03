public  class Contador{
    private static int numeroDeInstancias = 0;
    public Contador(){
        numeroDeInstancias++;
    }
    public static int getNumeroDeInstancias(){
        return numeroDeInstancias;
    }
}
