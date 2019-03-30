package upgrad;

	import java.util.Scanner;
	
	public class Final2
	{
		static int i9,i4,i=1,j=1,j1=1,i3=1,i1=1,i2=1,j3=1,k=1,l=1,delete=0,v=1,z=1,vr=0,rd=1,serve=0;
		static String name[] = new String[100];
		static double cgpa[] = new double[100];
		static int id[] = new int[100];
		static int vp[] = new int[100];
		static double min[]=new double[100];
		static String name1[] = new String[100];
		static double cgpa1[] = new double[100];
		static int id1[] = new int[100];
		
		public static int sort(int index,int count,int vr)
		{
			z=1;
			double minat=0;
			int x=index;
			
			for(i1=1;i1<=x;i1++)
			{
				if(id[i1]==vr)
				{
					continue;
				}
				else if(cgpa[i1]>minat )
				{
					minat=cgpa[i1];
					j1=i1;
				}
				else if(cgpa[i1]==minat)
				{
					if(name[i1]==name[j1])
					{
						if(id[i1]<id[j1])
						{
							j1=i1;
						}
					}
					
				}
				
				
			}
			
			chang(j1);
			
			return id1[1];
		}
		
		public static void chang(int j2)
		{
			
			min[z]=cgpa[j2];
			name1[z]=name[j2];
			cgpa1[z]=cgpa[j2];
			id1[z]=id[j2];
			z++;
		}
		public static void main(String args[])
		{
			 Scanner sc=new Scanner(System.in);
		   int flag=0;
			System.out.println("Enter the number of events:"); 
			int n=sc.nextInt();
			
			for( i=1;i<=n;i++)
			{
				System.out.println("Select the type of input (0:Enter, 1:Served) ");
				int m=sc.nextInt();
				if(m==0)
				{
					System.out.println("ENTER");
					System.out.println("Enter the student name and CGPA:");
					
					if(flag==0)
					{
					
				        name[i]=sc.next();
						cgpa[i]=sc.nextDouble();
						id[i]=i;
					}
					else if(flag==1)
					{
						for(j=1;j<=i;j++)
						{
							for(int p=1;p<=rd;p++)
							{
								if(id[j]==vp[p])
								{
									name[j]=sc.next();
									cgpa[j]=sc.nextDouble();
									id[j]=j;
									flag=0;
								   break;
								}
							}
							break;
							
						
							
						}
					}
				 }
				
			
				else if(m==1)
				{
					
					serve++;
					System.out.println("SERVED");
					if(i==1)
					{
						System.out.println("EMPTY");
					}
					 vr=sort(i,delete,vr);	
					 vp[rd]=vr;
					 rd++;
					
					 for(int f=1;f<=n;f++)
					 {
						 if(id[f]==vr)
						 {
							 cgpa[f]=0.0;
							 name[f]=null;
							 id[f]=0;
						 }
					 }
				    delete=delete+2;
				    flag=1;
				}
				
			}
			
			for(int q=1;q<=i;q++)
			{
				if(name[q]!=null)
					System.out.println("name:"+name[q]+"	 id:"+id[q]);
			}
		
		}
	   
	}
