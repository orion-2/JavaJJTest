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
	
	
	//독립된 단위테스트를 위해서는 라이브러리 (JUint)을 추가한다.
	//JUnit이란?
	//독립된 단위테스트를 지원해주는 프레임 워크
	
	/* 사용되는 어노테이션
	 * @Test    //@Test가 선언된 테서드가 테스트를 수행한다.
	 * @Ignore  //Test를 실행하지 않는다.
	 * @before  //@Test가 선언된 메서드가 실행되기 전에 수행 
	 */
	/*
	 * sysout 으로는 콘솔에 결과를 출력하지만 
	 * 단정(assert)메서드로 테스크의 결과를 판별한다.
	 * 예를들어 asserEquals (예상값, 실제값)
	 * 위에 단정 메서드는 예상값과 실제값이 일치하면 성공, 일치하지 않으면 실패
	 * 
	 */
	/* JUint메서드
	 * assertEquals(a,b) - 객체 또는 값이 일치한는가?
	 * assertArrayEquals(a,b) - 배열의 값이 일치하는가? 
	 * assertSame(a,b) - 같은 객체인가?
	 * assertTrue(a) - 조건이 참인가?
	 * assertNotNull(a) - 객체가 null이 아닌가? 
	 * assertNull(a) - 객체가 null인가?
	 */
}
