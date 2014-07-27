package com.nirensinha.myproject.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.nirensinha.myproject.model.Model;
import com.nirensinha.myproject.model.Status;
import com.nirensinha.myproject.repository.StatusRepository;

@Service
public class RepositoryStatusService implements StatusService{
	
	@Resource
	private StatusRepository statusRepository;
	
	SimpleDateFormat sdf = new SimpleDateFormat("MMddyyyy");

	@Override
	@Transactional
	public Status create(Status status) {
		return statusRepository.save(status);
	}

	@Override
	public Status delete(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Status> findAll() {
		return statusRepository.findAll();
	}

	@Override
	public Status findById(Long id) {
		return statusRepository.findOne(id);
	}

	@Override
	public Status save(Status status) {
		status.setReportDate(getMonday(status.getReportDate()));
		return statusRepository.save(status);
	}

	@Override
	public String checkStatus(long projectId, String reportDate) {
		Date date;
		try{
			date = sdf.parse(reportDate);
			date = getMonday(date);
		}catch (ParseException e){
			return "Report Date is invalid";
		}

		Status status = statusRepository.findStatusByProjectIdAndReportDate(projectId, date);
		if(status == null)
				return "success";
		else
				return "Status Report already exists";
		
	}
	
	private Date getMonday(Date date){
		Date date_;
		Calendar c = Calendar.getInstance();
		c.setTime(date);
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
		date_ = c.getTime();
		return date_;
	}

	@Override
	public Status findByProjectIdAndReportDate(long projectId, String reportDate) {
		Date date;
		try{
			date = sdf.parse(reportDate);
			date = getMonday(date);
		}catch (ParseException e){
			return new Status();
		}
		return statusRepository.findStatusByProjectIdAndReportDate(projectId, date);
	}

	@Override
	public List<Model> getStatusByProject(long projectId) {
   		return statusRepository.getStatusListByProjectId(projectId);
	}

}
