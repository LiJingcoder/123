import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Text {
	public static void main(String[] args) {
		Animals b1 = new Animals("��������Ȯ","Ȯ��",3,"����");//ʵ�������������
		Animals b2 = new Animals("è��","è��",5,"����");
		Animals b3 = new Animals("��","����",4,"����");
		List<Animals> allAnimals = null;
		allAnimals = new ArrayList<Animals>();
		allAnimals.add(b1);
		allAnimals.add(b2);
		allAnimals.add(b3);
		Scanner sc = new Scanner(System.in);
		Loop:while(true) {
			System.out.println("������һ�����֣�");
			int a = sc.nextInt();
			switch (a) {
				case 1://���Ӷ���
					System.out.print("�����붯���name:");
                    String c = sc.next();
                    System.out.println("�����붯��ĸ�Ŀ���ࣺ");
                    String c1 = sc.next();
                    System.out.println("�����붯������䣺");
                    int c2 = sc.nextInt();
                    System.out.println("�����붯����۴ƣ�");
                    String c3 = sc.next();
                    allAnimals.add(new Animals(c, c1, c2,c3));
					break;
				case 2://ɾ������	
					System.out.println("������Ҫɾ�������λ��:");
					int d = sc.nextInt();
					allAnimals.remove(d);
					break;
				case 3://�޸�����
					System.out.println("��������Ҫ�޸Ķ����λ�ã�");
                    int id1 = sc.nextInt();
                    System.out.println("�������޸Ķ����name��");
                    String q = sc.next();
                    System.out.println("�����붯��ĸ�Ŀ���ࣺ");
                    String q1 = sc.next();
                    System.out.println("�������޸Ķ�������䣺");
                    int q2 = sc.nextInt();
                    System.out.println("�������޸Ķ�����۴ƣ�");
                    String q3 = sc.next();
                    allAnimals.add(id1 + 1, new Animals(q,q1,q2,q3));
                    break;
                case 4://��ѯ
    					System.out.println("������Ҫ��ѯ�����λ��");
    					int f = sc.nextInt();
    					System.out.println("�������֣�"+allAnimals.get(f).name+"�� ������۴ƣ�" +allAnimals.get(f).sex+"�� ��������䣺" + allAnimals.get(f).age);
    					break;
				case 5://�������������
					Collections.sort(allAnimals);
					for (int j = 0; j < allAnimals.size(); j++) {
                        System.out.println("�������֣�"+allAnimals.get(j).name+"�� ������۴ƣ�" +allAnimals.get(j).sex+"�� ��������䣺" + allAnimals.get(j).age);
					}
					break;
				case 6:
					System.out.println("�������");
					break Loop;
			}
		}
	}
}
