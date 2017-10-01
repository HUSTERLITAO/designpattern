package prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class prototypeTest implements Cloneable,Serializable {

	private static final long serialVersionUID=1L;
	
	private String string;
	
	private SerializableObject obj;
	
	/*ǳ����*/
	public Object clone() throws CloneNotSupportedException{
		prototypeTest proto=(prototypeTest)super.clone();
		return proto;
	}
	
	/*���*/
	public Object deepClone() throws IOException,ClassNotFoundException{
		
		/*д�뵱ǰ����Ķ�������*/
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		ObjectOutputStream oos=new ObjectOutputStream(bos);
		oos.writeObject(this);
		
	/*������ǰ����Ķ�������*/
	ByteArrayInputStream bis=new ByteArrayInputStream(bos.toByteArray());
	ObjectInputStream ois=new ObjectInputStream(bis);
	return ois.readObject();
	}
	
	
	public void SetString(String string){
		this.string=string;
	}
	
	public String getString(){
		return string;
	}
	
	public SerializableObject getObj(){
	   return obj;	
	}
	
	public void  setObj(SerializableObject obj){
		this.obj=obj;
	}
	
	
	
}
