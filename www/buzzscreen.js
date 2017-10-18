var exec = require('cordova/exec');

var BuzzScreen = {
  activate: function(successCallback, errorCallback){
    cordova.exec(successCallback, errorCallback, 'BuzzScreen', 'activate', []);
  },

  deactivate: function(successCallback, errorCallback){
    cordova.exec(successCallback, errorCallback, 'BuzzScreen', 'deactivate', []);
  },

  logout: function(successCallback, errorCallback){
    cordova.exec(successCallback, errorCallback, 'BuzzScreen', 'logout', []);
  },

  setUserId: function(userId, successCallback, errorCallback){
    cordova.exec(successCallback, errorCallback, 'BuzzScreen', 'setUserId', [userId]);
  },

  setBirthYear: function(birthYear, successCallback, errorCallback){
    cordova.exec(successCallback, errorCallback, 'BuzzScreen', 'setBirthYear', [birthYear]);
  },

  setGender: function(gender, successCallback, errorCallback){
    cordova.exec(successCallback, errorCallback, 'BuzzScreen', 'setGender', [gender]);
  }
} 

module.exports = BuzzScreen;
