/**
 * 
 */
package com.ibatis.sqlmap.engine.sharding;

/**
 * @author sean.he
 *
 */
public interface ShardingStrategy {
	/**
	 * ����õ��µı���
	 * @param baseTableName �߼�����
	 * @param params Ϊsharding�߼��ṩ��Ҫ����
	 * @return 
	 */
	public String getTargetTableName(String baseTableName,Object params);
}
