package com.zwp.simpleboot.mapper;

import com.zwp.simpleboot.entity.BookContent;
import com.zwp.simpleboot.entity.BookContentCriteria;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface BookContentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @SelectProvider(type=BookContentSqlProvider.class, method="countByExample")
    long countByExample(BookContentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @DeleteProvider(type=BookContentSqlProvider.class, method="deleteByExample")
    int deleteByExample(BookContentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @Insert({
        "insert into book_content (id, name, ",
        "chapter, number, ",
        "content)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{chapter,jdbcType=VARCHAR}, #{number,jdbcType=INTEGER}, ",
        "#{content,jdbcType=LONGVARCHAR})"
    })
    int insert(BookContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @InsertProvider(type=BookContentSqlProvider.class, method="insertSelective")
    int insertSelective(BookContent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @SelectProvider(type=BookContentSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="chapter", property="chapter", jdbcType=JdbcType.VARCHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<BookContent> selectByExampleWithBLOBs(BookContentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @SelectProvider(type=BookContentSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="chapter", property="chapter", jdbcType=JdbcType.VARCHAR),
        @Result(column="number", property="number", jdbcType=JdbcType.INTEGER)
    })
    List<BookContent> selectByExample(BookContentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BookContentSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") BookContent record, @Param("example") BookContentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BookContentSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") BookContent record, @Param("example") BookContentCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_content
     *
     * @mbg.generated
     */
    @UpdateProvider(type=BookContentSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") BookContent record, @Param("example") BookContentCriteria example);
}