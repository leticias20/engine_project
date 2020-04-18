package com.example.restservice;

public class Engine {

	private final long id;
	private final String engine_id;
	private final String engine_number;
	private final String speed;
	private final String oil_temp;
	private final String status;
	private final String output_predict;



	public Engine(long id, String engine_id, String engine_number, String speed, String oil_temp, String status, String output_predict) {
		this.id = id;
		this.engine_id = engine_id;
		this.engine_number = engine_number;
		this.speed = speed;
		this.oil_temp = oil_temp;
		this.status = status;
		this.output_predict = output_predict;

	}

	public long getId() {
		return id;
	}

	public String getEngine_id() {
		return engine_id;
	}

	public String getEngine_number() {
		return engine_number;
	}

	public String getSpeed() {
		return speed;
	}

	public String getOil_temp() {
		return oil_temp;
	}

	public String getStatus() {
		return status;
	}

	public String getOutput_predict() {
		return output_predict;
	}
}
