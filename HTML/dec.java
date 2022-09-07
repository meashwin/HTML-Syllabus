class dec
{
    public static void main (String[] args)
    {
        int i=-1;
        int j=-6;
        int k=j-j++;
        int l=++k+-2+k++;
        ++k;
        l++;
        System.out.println(l--);
        System.out.println(l);
        i=i++ +l;
        k=++k;
        System.out.println(l);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

    }
}