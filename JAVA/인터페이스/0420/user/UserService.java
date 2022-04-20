package user;

import java.util.List;

public class UserService implements UserServiceImple {

        //1. �μ��̸��� DEVELOP�� ��� �޿��� 2�� �λ��Ͻÿ�.
        public List<UserVO> updateSal(List<UserVO> list, String dname){
            for(int i=0; i<list.size(); ++i) {
            	if(list.get(i).getDname().equals(dname)) {
            		list.get(i).setSal(list.get(i).getSal()*2);
            		System.out.println("����1 "+list.get(i).getEname()+" "+list.get(i).getDname()+" "+list.get(i).getSal());
            	}
            }
        	return list;
        }
        
        
        //2. �޿��� 0 ~ 100 : 1 ����, 101 ~ 1000 : 2 ����, 1001 �̻���ʹ� 3 ������ �����Ͻÿ�.
        public List<UserVO> updateLv(List<UserVO> list){
        	for(int i=0;i<list.size();++i) {
        		if(list.get(i).getSal()>=0 && list.get(i).getSal() <= 100) {
        			list.get(i).setLv(1);
        		}
        		if(list.get(i).getSal() > 100 && list.get(i).getSal() <= 1000) {
        			list.get(i).setLv(2);
        		}
        		if(list.get(i).getSal() >= 1001) {
        			list.get(i).setLv(3);
        		}
        		System.out.println("����2 "+list.get(i).getEname()+" "+list.get(i).getDname()+" "+list.get(i).getSal()+" "+list.get(i).getLv());
        	}
            return list;
        }
        //3. ���� 3�̻� ������ ��� �ذ��Ͻÿ�.
        public List<UserVO> deleteUser(List<UserVO> list, int lv){
        	for(int i=0; i<list.size();++i) {
        		if(list.get(i).getLv() == 3) {
        			System.out.println("����3. : "+list.remove(i).getEname());
        		}
        	}
            return list;
        }
        //4. �̸��� King�� ������ ��� ���� ��ȸ.
        public UserVO selectUserByEname(List<UserVO> list, String ename){
        	for(int i=0; i<list.size();++i) {
        		if(list.get(i).getEname().equals(ename)) {
        			System.out.println("����4 "+list.get(i).getEname()+" "+list.get(i).getDname()+" "+list.get(i).getSal()+" "+list.get(i).getLv());
        		}
        	}
            return null;
        
        }
}
