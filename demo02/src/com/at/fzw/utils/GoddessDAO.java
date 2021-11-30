package com.at.fzw.utils;

import com.at.fzw.bean.Goddess;

import java.sql.Connection;
import java.util.List;

public class GoddessDAO extends BaseSource implements DAO<Goddess> {
    @Override
    public void insert(Connection conn, Goddess goddess) {
        String sql = "insert into goddesss(sid,sname,ssex,sage,saddress) values(?,?,?,?,?)";
        update(conn, sql, goddess.getSid(), goddess.getsName(), goddess.getsSex(), goddess.getsAge(), goddess.getsAddress());

    }

    @Override
    public void delete(Connection conn, int id) {
        String sql = "delete from goddess where sid =?";
        update(conn, sql, id);
    }

    @Override
    public List<Goddess> selection(Class<Goddess> clazz, Connection conn, int id) {
      String sql="select sid sId,sname sName,ssex sSex,sage sAge,saddress sAddress from goddess where sId=?";
      return select(clazz,conn,sql,id);

    }
}
