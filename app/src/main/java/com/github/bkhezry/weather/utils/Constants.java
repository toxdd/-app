package com.github.bkhezry.weather.utils;

public class Constants {
  public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/";
  public static final String UNITS = "metric";
  public static final String[] DAYS_OF_WEEK = {
      "Sunday",
      "Monday",
      "Tuesday",
      "Wednesday",
      "Thursday",
      "Friday",
      "Saturday"
  };
  public static final String[] MONTH_NAME = {
      "January",
      "February",
      "March",
      "April",
      "May",
      "June",
      "July",
      "August",
      "September",
      "October",
      "November",
      "December"
  };

  public static final String[] DAYS_OF_WEEK_CHINESE = {
          "星期日",
          "星期一",
          "星期二",
          "星期三",
          "星期四",
          "星期五",
          "星期六"
  };

  public static final String[] MONTH_NAME_CHINESE = {
          "一月",
          "二月",
          "三月",
          "四月",
          "五月",
          "六月",
          "七月",
          "八月",
          "九月",
          "十月",
          "十一月",
          "十二月"
  };

  public static final String[] WEATHER_STATUS = {
      "Thunderstorm",
      "Drizzle",
      "Rain",
      "Snow",
      "Atmosphere",
      "Clear",
      "Few Clouds",
      "Broken Clouds",
      "Cloud"
  };

  public static final String[] WEATHER_STATUS_CHINESE = {
          "雷暴",
          "小雨",
          "中雨",
          "雪",
          "大气层",
          "晴",
          "局部多云",
          "多云",
          "阴"

  };


  public static final String CITY_INFO = "city-info";

  public static final long TIME_TO_PASS = 6 * 600000;

  public static final String LAST_STORED_CURRENT = "last-stored-current";
  public static final String LAST_STORED_MULTIPLE_DAYS = "last-stored-multiple-days";
  public static final String OPEN_WEATHER_MAP_WEBSITE = "https://home.openweathermap.org/api_keys";

  public static final String API_KEY = "api-key";
  public static final String LANGUAGE = "language";
  public static final String DARK_THEME = "dark-theme";
  public static final String FIVE_DAY_WEATHER_ITEM = "five-day-weather-item";
}
