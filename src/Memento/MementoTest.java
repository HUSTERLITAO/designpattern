package Memento;

public class MementoTest {

	public static void main(String[] args){
		
		//����ԭʼ��
		Original orig=new Original("egg");
		
		//��������¼
		Storage storage=new Storage(orig.createMemento);
		
		System.out.println("��ʼ״̬Ϊ"+orig.getValue());
		orig.setValue("niu");
		System.out.println("�޸ĺ��״̬Ϊ"+ orig.getValue());
		
		
		//�ָ�ԭʼ���״̬
		orig.restoreMemento(storage.getMemento());
		System.out.println("�ָ����״̬Ϊ:"+orig.getValue());
	}
	
}
