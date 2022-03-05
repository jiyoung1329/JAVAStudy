package disassemble.DAO;

import java.util.HashMap;

import disassemble.DTO.MemberDTO;

public interface IMemberDAO {
	public HashMap<String, MemberDTO> selectAll() ;
	public MemberDTO selectEmail(String email);
	public void insert(MemberDTO member);
	public void update(MemberDTO member);
	public void delete(String email);
}
