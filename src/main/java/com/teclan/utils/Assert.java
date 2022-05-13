/**
 * 
 */
package com.teclan.utils;


/**
 * 断言工具类
 * @author TanBingJian
 * @since 2019年3月21日
 */
public class Assert {
	
	
	/***
	 * 断言{@code value} 的值不为空，如果为空，则抛出异常 
	 * 
	 *{@code assertNotBlank(null,"applyDate") },将会抛出异常，异常信息为：交易日期不能为空！ 
	 * @param value
	 */
	public  static void assertNotBlank(String value, String message) throws Exception{
		if(assertNull(value)){
			throw new Exception(message);
		}
	}
	
	public static void assertNotBlank(String value) throws Exception{
		assertNotBlank(value, "字段值为空");
	}

	public static boolean assertNotNull(Object value) {
		return !assertNull(value);
	}
	
	public static boolean assertNull(Object value) {
		return value==null||"".equals(value.toString().trim());
	}



	public static boolean assertEquals(Object value1, Object value2) {
		
		if(value1==null&&value2==null){
			return true;
		}
		if(value1==null&&value2!=null){
			return false;
		}
		
		return value1.equals(value2);
	}
	
	public static boolean assertNotEquals(Object value1, Object value2) {
		return !assertEquals(value1, value2);
	}

	/**
	 * 断言值 @Code{object} 在集合 @{items} 中至少存在一个与之相等
	 *
	 * @param object 变量，需要比对的唯一值
	 * @param items 一个存储多个待匹配数据的集合
	 * @return
	 */
	public static boolean assertEqualsOneAtLeast(Object object, Object...items){

		for(Object item:items){
			if(assertEquals(object,item)){
				return true;
			}
		}
		return false;
	}
}
