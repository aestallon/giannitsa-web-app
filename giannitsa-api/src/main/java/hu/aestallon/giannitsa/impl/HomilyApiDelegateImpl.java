package hu.aestallon.giannitsa.impl;

import hu.aestallon.giannitsa.api.HomilyApiDelegate;
import hu.aestallon.giannitsa.model.Homily;
import hu.aestallon.giannitsa.model.HomilyUploadRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;

public class HomilyApiDelegateImpl implements HomilyApiDelegate {

  @Override
  public ResponseEntity<Void> deleteHomily(Long homilyId) {
    return HomilyApiDelegate.super.deleteHomily(homilyId);
  }

  @Override
  public ResponseEntity<List<Homily>> getAllHomilies() {
    return HomilyApiDelegate.super.getAllHomilies();
  }

  @Override
  public ResponseEntity<Homily> getHomily(Long homilyId) {
    return HomilyApiDelegate.super.getHomily(homilyId);
  }

  @Override
  public ResponseEntity<Void> postHomily(Homily homily, MultipartFile content) {
    return HomilyApiDelegate.super.postHomily(homily, content);
  }

  @Override
  public ResponseEntity<Homily> updateHomily(Long homilyId, Homily homily) {
    return HomilyApiDelegate.super.updateHomily(homilyId, homily);
  }
}
