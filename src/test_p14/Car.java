package test_p14;

public class Car
{
		private int num;
		private double gas;
		
		public Car()
		{
			num = 0;
			gas = 0.0;
			System.out.println("�w�Ͳ��F��T��");
		}
		
		public void setCar(int n, double g)
		{
			num = n;
			gas = g;
			
			System.out.println("�N�����]��" + num + "�T�o�q�]��" + gas);
		}
		
		public void show()
		{
			System.out.println("������" + num);
			System.out.println("�T�o�q��" + gas);
		}
}