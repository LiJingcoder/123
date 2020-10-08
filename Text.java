import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.*;

public class Text {
	public static void main(String[] args) {
		Animals b1 = new Animals("拉布拉多犬","犬类",3,"雄性");//实例化动物类对象
		Animals b2 = new Animals("猫咪","猫科",5,"雌性");
		Animals b3 = new Animals("猪","家畜",4,"雌性");
		List<Animals> allAnimals = null;
		allAnimals = new ArrayList<Animals>();
		allAnimals.add(b1);
		allAnimals.add(b2);
		allAnimals.add(b3);
		Scanner sc = new Scanner(System.in);
		Loop:while(true) {
			System.out.println("请输入一个数字：");
			int a = sc.nextInt();
			switch (a) {
				case 1://增加动物
					System.out.print("请输入动物的name:");
                    String c = sc.next();
                    System.out.println("请输入动物的纲目种类：");
                    String c1 = sc.next();
                    System.out.println("请输入动物的年龄：");
                    int c2 = sc.nextInt();
                    System.out.println("请输入动物的雄雌：");
                    String c3 = sc.next();
                    allAnimals.add(new Animals(c, c1, c2,c3));
					break;
				case 2://删除动物	
					System.out.println("请输入要删除动物的位置:");
					int d = sc.nextInt();
					allAnimals.remove(d);
					break;
				case 3://修改内容
					System.out.println("请输入你要修改动物的位置：");
                    int id1 = sc.nextInt();
                    System.out.println("请输入修改动物的name：");
                    String q = sc.next();
                    System.out.println("请输入动物的纲目种类：");
                    String q1 = sc.next();
                    System.out.println("请输入修改动物的年龄：");
                    int q2 = sc.nextInt();
                    System.out.println("请输入修改动物的雄雌：");
                    String q3 = sc.next();
                    allAnimals.add(id1 + 1, new Animals(q,q1,q2,q3));
                    break;
                case 4://查询
    					System.out.println("请输入要查询动物的位置");
    					int f = sc.nextInt();
    					System.out.println("动物名字："+allAnimals.get(f).name+"、 动物的雄雌：" +allAnimals.get(f).sex+"、 动物的年龄：" + allAnimals.get(f).age);
    					break;
				case 5://按年龄排序并输出
					Collections.sort(allAnimals);
					for (int j = 0; j < allAnimals.size(); j++) {
                        System.out.println("动物名字："+allAnimals.get(j).name+"、 动物的雄雌：" +allAnimals.get(j).sex+"、 动物的年龄：" + allAnimals.get(j).age);
					}
					break;
				case 6:
					System.out.println("程序结束");
					break Loop;
			}
		}
	}
}
