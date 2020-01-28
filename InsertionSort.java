class InsertionSort
{

public static void main(String[] args)
{
InsertionSort();
}

public static void InsertionSort()
{
int a[]={0,5,30,10,2,4,2,8,3};
int n=a.length;
for(int i=1;i<n;i++)
{
    int temp=a[i];int j=i-1;
    while(j>=0 && temp<a[j])
    {a[j+1]=a[j];j--;}
    a[j+1]=temp;
}

for(int i:a)
System.out.print(i+" ");



}

}