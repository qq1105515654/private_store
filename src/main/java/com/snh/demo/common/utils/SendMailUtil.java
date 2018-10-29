package com.snh.demo.common.utils;

import com.snh.demo.domain.MailInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import javax.mail.Session;
import java.util.Date;
import java.util.Properties;

public class SendMailUtil {


    public static JavaMailSender sender;

    public MailSender getSender() {
        return sender;
    }

    @Autowired
    public void setSender(JavaMailSender sender) {
        this.sender = sender;
    }


    public static void main(String[] args) {


        SimpleMailMessage mailMessage=new SimpleMailMessage();

    }


    /**
     *  发送简单邮件
     * @param to      接收人
     * @param subject   主题
     * @param content   内容
     */
    public static void sendMail(String to,String subject, String content){

        SimpleMailMessage mailMessage=new SimpleMailMessage();
        MailInfo info=new MailInfo();
        mailMessage.setFrom(info.getUserName());
        mailMessage.setTo(to);
        mailMessage.setSentDate(new Date());
        mailMessage.setSubject(subject);
        mailMessage.setText(content);
        try {
            sender.send(mailMessage);

        }catch (Exception e){

            e.printStackTrace();

        }
    }




}
