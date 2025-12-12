package org.example.booking.api.common.application.port.in;

import org.example.booking.api.common.adapter.in.web.dto.FileDto;

public interface FileUseCase {
    void saveFile();
    void deleteFile();

    FileDto.FileQueryResponse getFile();

}
