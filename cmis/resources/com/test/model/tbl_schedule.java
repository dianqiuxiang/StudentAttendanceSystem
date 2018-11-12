package com.test.model;

public class tbl_schedule {
    /**
     *主键
     */
    private Integer id;

    /**
     *上课地点
     */
    private String schedule_Address;

    /**
     *第几节课
     */
    private String schedule_Num;

    /**
     *上课时间
     */
    private String schedule_Start;

    /**
     *下课时间
     */
    private String schedule_End;

    /**
     *星期几
     */
    private String schedule_Weekday;

    /**
     *记录创建时间
     */
    private String create_Time;

    /**
     *记录修改时间
     */
    private String update_Time;

    /**
     *主键
     */
    public Integer getId() {
        return id;
    }

    /**
     *主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     *上课地点
     */
    public String getSchedule_Address() {
        return schedule_Address;
    }

    /**
     *上课地点
     */
    public void setSchedule_Address(String schedule_Address) {
        this.schedule_Address = schedule_Address == null ? null : schedule_Address.trim();
    }

    /**
     *第几节课
     */
    public String getSchedule_Num() {
        return schedule_Num;
    }

    /**
     *第几节课
     */
    public void setSchedule_Num(String schedule_Num) {
        this.schedule_Num = schedule_Num == null ? null : schedule_Num.trim();
    }

    /**
     *上课时间
     */
    public String getSchedule_Start() {
        return schedule_Start;
    }

    /**
     *上课时间
     */
    public void setSchedule_Start(String schedule_Start) {
        this.schedule_Start = schedule_Start == null ? null : schedule_Start.trim();
    }

    /**
     *下课时间
     */
    public String getSchedule_End() {
        return schedule_End;
    }

    /**
     *下课时间
     */
    public void setSchedule_End(String schedule_End) {
        this.schedule_End = schedule_End == null ? null : schedule_End.trim();
    }

    /**
     *星期几
     */
    public String getSchedule_Weekday() {
        return schedule_Weekday;
    }

    /**
     *星期几
     */
    public void setSchedule_Weekday(String schedule_Weekday) {
        this.schedule_Weekday = schedule_Weekday == null ? null : schedule_Weekday.trim();
    }

    /**
     *记录创建时间
     */
    public String getCreate_Time() {
        return create_Time;
    }

    /**
     *记录创建时间
     */
    public void setCreate_Time(String create_Time) {
        this.create_Time = create_Time == null ? null : create_Time.trim();
    }

    /**
     *记录修改时间
     */
    public String getUpdate_Time() {
        return update_Time;
    }

    /**
     *记录修改时间
     */
    public void setUpdate_Time(String update_Time) {
        this.update_Time = update_Time == null ? null : update_Time.trim();
    }
}