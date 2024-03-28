//인터페이스
package com.saeyan.dao;

import java.util.List;

import com.saeyan.dto.CartDTO;

public interface CartDAO {
   
   List<CartDTO> selectAll(int userCode);
   //이 메서드는 사용자 코드를 기반으로 모든 장바구니 정보를 가져오는 데 사용.
   //이 메서드는 데이터베이스에 쿼리를 실행하여 사용자에 대한 모든 장바구니 정보를 검색하고,
   //이를 List<CartDTO> 형태로 반환.
   int insert(int userNo, int productNo, int cartQty) throws Exception;
   //이 메서드는 새로운 장바구니 항목을 추가하는 데 사용.
   //메서드는 사용자 번호, 상품 번호, 장바구니에 추가할 수량을 파라미터로 받습니다.
   //이 메서드는 데이터베이스에 새로운 장바구니 항목을 추가하기 위해 사용. 데이터베이스 작업 중에 예외가 발생할 수 있으며,
   //이를 Exception으로 처리하여 호출자에게 예외를 전파.
   int update(int cartNo, int cartQty) throws Exception;
   //이 메서드는 장바구니에 있는 특정 상품의 수량을 업데이트하는 데 사용.
   //메서드는 장바구니 번호와 업데이트할 수량을 파라미터로 받습니다.
   //이 메서드는 데이터베이스에 저장된 장바구니 정보를 업데이트하기 위해 사용.
   //데이터베이스 작업 중에 예외가 발생할 수 있으며, 이를 Exception으로 처리하여 호출자에게 예외를 전파. 
   int delete(int cartNo) throws Exception;
   //이 메서드는 장바구니에서 특정 항목을 삭제하는 데 사용.
   //메서드는 삭제할 장바구니 항목의 번호를 파라미터로 받습니다.
   //이 메서드는 데이터베이스에서 해당 장바구니 항목을 삭제하기 위해 사용됩니다.
   //데이터베이스 작업 중에 예외가 발생할 수 있으며, 이를 Exception으로 처리하여 호출자에게 예외를 전파.
}