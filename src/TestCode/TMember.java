package TestCode;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

import mainSrc.Member;

public class TMember {
	Member newMember;
	Member oldMember;
	@Test
	public void Test1() {
//		System.out.println(newMember);
//		System.out.println(oldMember);
//		assertEquals(newMember,oldMember);
		assertNull(newMember);
//		if (newMember == null) {
//			System.out.println("ok");
//		}
//		assertTrue(newMember == null);
	}
	
	@Ignore
	public void Test2() {
		newMember = new Member();
		oldMember = new Member();
	}
	
	
	//������ �����׽�Ʈ�� ���ؼ��� ���̺귯�� (JUint)�� �߰��Ѵ�.
	//JUnit�̶�?
	//������ �����׽�Ʈ�� �������ִ� ������ ��ũ
	
	/* ���Ǵ� ������̼�
	 * @Test    //@Test�� ����� �׼��尡 �׽�Ʈ�� �����Ѵ�.
	 * @Ignore  //Test�� �������� �ʴ´�.
	 * @before  //@Test�� ����� �޼��尡 ����Ǳ� ���� ���� 
	 */
	/*
	 * sysout ���δ� �ֿܼ� ����� ��������� 
	 * ����(assert)�޼���� �׽�ũ�� ����� �Ǻ��Ѵ�.
	 * ������� asserEquals (����, ������)
	 * ���� ���� �޼���� ���󰪰� �������� ��ġ�ϸ� ����, ��ġ���� ������ ����
	 * 
	 */
	/* JUint�޼���
	 * assertEquals(a,b) - ��ü �Ǵ� ���� ��ġ�Ѵ°�?
	 * assertArrayEquals(a,b) - �迭�� ���� ��ġ�ϴ°�? 
	 * assertSame(a,b) - ���� ��ü�ΰ�?
	 * assertTrue(a) - ������ ���ΰ�?
	 * assertNotNull(a) - ��ü�� null�� �ƴѰ�? 
	 * assertNull(a) - ��ü�� null�ΰ�?
	 */
}
