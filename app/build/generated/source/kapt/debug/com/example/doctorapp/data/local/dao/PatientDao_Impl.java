package com.example.doctorapp.data.local.dao;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.doctorapp.data.local.entity.PatientEntity;
import com.example.doctorapp.data.local.entity.converter.DateTypeConverter;
import com.example.doctorapp.domain.model.Gender;
import java.lang.Class;
import java.lang.Exception;
import java.lang.IllegalArgumentException;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import javax.annotation.processing.Generated;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@Generated("androidx.room.RoomProcessor")
@SuppressWarnings({"unchecked", "deprecation"})
public final class PatientDao_Impl implements PatientDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PatientEntity> __insertionAdapterOfPatientEntity;

  private final DateTypeConverter __dateTypeConverter = new DateTypeConverter();

  private final EntityDeletionOrUpdateAdapter<PatientEntity> __deletionAdapterOfPatientEntity;

  private final SharedSQLiteStatement __preparedStmtOfClearAll;

  private final EntityUpsertionAdapter<PatientEntity> __upsertionAdapterOfPatientEntity;

  public PatientDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPatientEntity = new EntityInsertionAdapter<PatientEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `PatientEntity` (`id`,`name`,`surname`,`email`,`fiscalCode`,`gender`,`birthdayDate`,`doctorFiscalCode`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getSurname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSurname());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getFiscalCode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFiscalCode());
        }
        if (value.getGender() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, __Gender_enumToString(value.getGender()));
        }
        final Long _tmp = __dateTypeConverter.fromDate(value.getBirthdayDate());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getDoctorFiscalCode() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDoctorFiscalCode());
        }
      }
    };
    this.__deletionAdapterOfPatientEntity = new EntityDeletionOrUpdateAdapter<PatientEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `PatientEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
      }
    };
    this.__preparedStmtOfClearAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM patiententity";
        return _query;
      }
    };
    this.__upsertionAdapterOfPatientEntity = new EntityUpsertionAdapter<PatientEntity>(new EntityInsertionAdapter<PatientEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT INTO `PatientEntity` (`id`,`name`,`surname`,`email`,`fiscalCode`,`gender`,`birthdayDate`,`doctorFiscalCode`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getSurname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSurname());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getFiscalCode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFiscalCode());
        }
        if (value.getGender() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, __Gender_enumToString(value.getGender()));
        }
        final Long _tmp = __dateTypeConverter.fromDate(value.getBirthdayDate());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getDoctorFiscalCode() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDoctorFiscalCode());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<PatientEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE `PatientEntity` SET `id` = ?,`name` = ?,`surname` = ?,`email` = ?,`fiscalCode` = ?,`gender` = ?,`birthdayDate` = ?,`doctorFiscalCode` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PatientEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getSurname() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getSurname());
        }
        if (value.getEmail() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getEmail());
        }
        if (value.getFiscalCode() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getFiscalCode());
        }
        if (value.getGender() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, __Gender_enumToString(value.getGender()));
        }
        final Long _tmp = __dateTypeConverter.fromDate(value.getBirthdayDate());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        if (value.getDoctorFiscalCode() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getDoctorFiscalCode());
        }
        if (value.getId() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getId());
        }
      }
    });
  }

  @Override
  public Object insert(final PatientEntity patient, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfPatientEntity.insert(patient);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public void delete(final PatientEntity patient) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfPatientEntity.handle(patient);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Object clearAll(final Continuation<? super Unit> arg0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClearAll.release(_stmt);
        }
      }
    }, arg0);
  }

  @Override
  public Object upsertAll(final PatientEntity patient, final Continuation<? super Unit> arg1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfPatientEntity.upsert(patient);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, arg1);
  }

  @Override
  public PatientEntity getByFiscalCode(final String fiscalCode) {
    final String _sql = "SELECT * FROM patiententity WHERE fiscalCode = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (fiscalCode == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, fiscalCode);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfSurname = CursorUtil.getColumnIndexOrThrow(_cursor, "surname");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfFiscalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "fiscalCode");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfBirthdayDate = CursorUtil.getColumnIndexOrThrow(_cursor, "birthdayDate");
      final int _cursorIndexOfDoctorFiscalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorFiscalCode");
      final PatientEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpSurname;
        if (_cursor.isNull(_cursorIndexOfSurname)) {
          _tmpSurname = null;
        } else {
          _tmpSurname = _cursor.getString(_cursorIndexOfSurname);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpFiscalCode;
        if (_cursor.isNull(_cursorIndexOfFiscalCode)) {
          _tmpFiscalCode = null;
        } else {
          _tmpFiscalCode = _cursor.getString(_cursorIndexOfFiscalCode);
        }
        final Gender _tmpGender;
        _tmpGender = __Gender_stringToEnum(_cursor.getString(_cursorIndexOfGender));
        final Date _tmpBirthdayDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfBirthdayDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfBirthdayDate);
        }
        _tmpBirthdayDate = __dateTypeConverter.toDate(_tmp);
        final String _tmpDoctorFiscalCode;
        if (_cursor.isNull(_cursorIndexOfDoctorFiscalCode)) {
          _tmpDoctorFiscalCode = null;
        } else {
          _tmpDoctorFiscalCode = _cursor.getString(_cursorIndexOfDoctorFiscalCode);
        }
        _result = new PatientEntity(_tmpId,_tmpName,_tmpSurname,_tmpEmail,_tmpFiscalCode,_tmpGender,_tmpBirthdayDate,_tmpDoctorFiscalCode);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public PatientEntity getByEmail(final String email) {
    final String _sql = "SELECT * FROM patiententity WHERE email = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfSurname = CursorUtil.getColumnIndexOrThrow(_cursor, "surname");
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfFiscalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "fiscalCode");
      final int _cursorIndexOfGender = CursorUtil.getColumnIndexOrThrow(_cursor, "gender");
      final int _cursorIndexOfBirthdayDate = CursorUtil.getColumnIndexOrThrow(_cursor, "birthdayDate");
      final int _cursorIndexOfDoctorFiscalCode = CursorUtil.getColumnIndexOrThrow(_cursor, "doctorFiscalCode");
      final PatientEntity _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getString(_cursorIndexOfId);
        }
        final String _tmpName;
        if (_cursor.isNull(_cursorIndexOfName)) {
          _tmpName = null;
        } else {
          _tmpName = _cursor.getString(_cursorIndexOfName);
        }
        final String _tmpSurname;
        if (_cursor.isNull(_cursorIndexOfSurname)) {
          _tmpSurname = null;
        } else {
          _tmpSurname = _cursor.getString(_cursorIndexOfSurname);
        }
        final String _tmpEmail;
        if (_cursor.isNull(_cursorIndexOfEmail)) {
          _tmpEmail = null;
        } else {
          _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        }
        final String _tmpFiscalCode;
        if (_cursor.isNull(_cursorIndexOfFiscalCode)) {
          _tmpFiscalCode = null;
        } else {
          _tmpFiscalCode = _cursor.getString(_cursorIndexOfFiscalCode);
        }
        final Gender _tmpGender;
        _tmpGender = __Gender_stringToEnum(_cursor.getString(_cursorIndexOfGender));
        final Date _tmpBirthdayDate;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfBirthdayDate)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfBirthdayDate);
        }
        _tmpBirthdayDate = __dateTypeConverter.toDate(_tmp);
        final String _tmpDoctorFiscalCode;
        if (_cursor.isNull(_cursorIndexOfDoctorFiscalCode)) {
          _tmpDoctorFiscalCode = null;
        } else {
          _tmpDoctorFiscalCode = _cursor.getString(_cursorIndexOfDoctorFiscalCode);
        }
        _result = new PatientEntity(_tmpId,_tmpName,_tmpSurname,_tmpEmail,_tmpFiscalCode,_tmpGender,_tmpBirthdayDate,_tmpDoctorFiscalCode);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }

  private String __Gender_enumToString(final Gender _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case MALE: return "MALE";
      case FEMALE: return "FEMALE";
      case OTHER: return "OTHER";
      default: throw new IllegalArgumentException("Can't convert enum to string, unknown enum value: " + _value);
    }
  }

  private Gender __Gender_stringToEnum(final String _value) {
    if (_value == null) {
      return null;
    } switch (_value) {
      case "MALE": return Gender.MALE;
      case "FEMALE": return Gender.FEMALE;
      case "OTHER": return Gender.OTHER;
      default: throw new IllegalArgumentException("Can't convert value to enum, unknown value: " + _value);
    }
  }
}
